.section .data
msg:
	.string "Hello"
msg_len = . -msg

.section .text
	.globl _start

_start:
	//Dua msg_len vao %cl, -1 de loai bo ky tu null, 
	//+ '0' de chuyen tu so sang ky tu so, cuoi cung dua gia tri torng %cl vao bien output
	mov $msg_len, %cl
	dec %cl
	add $'0', %cl
	mov %cl, (output)

	movl $output, %ecx
	movl $1, %edx
	movl $1, %ebx
	movl $4, %eax
	int $0x80
	jmp _exit

_exit:
	movl $1, %eax
	int $0x80

.section .bss
	.lcomm output, 1
