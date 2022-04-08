.section .data
	msg:
		.string "Nhap so (0 < x < 9): "
	msg_len = . -msg

.section .text
	.globl _start

_start:
	//print msg
	movl $msg_len, %edx
	movl $4, %eax
	movl $1, %ebx
	movl $msg, %ecx
	int $0x80

	//doc input
	movl $1, %edx
	movl $3, %eax
	movl $0, %ebx
	movl $input, %ecx
	int $0x80

	//chuyen input tu char ve so
	mov (input), %cl
	sub $'0', %cl

	//check
	sal $7, %cl
	sar $7, %cl
	
	//chuyen tu so sang ky tu so
	inc %cl
	add $'0', %cl
	mov %cl, (input)

	//xuat input
	movl $1, %edx
        movl $4, %eax
        movl $1, %ebx
        movl $input, %ecx
        int $0x80

	jmp _exit
	
_exit:
	movl $1, %eax
	int $0x80

.section .bss
	.lcomm input, 1
