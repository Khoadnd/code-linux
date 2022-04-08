.section .data
	msg:
		.string "Enter a number (1 digit): "
	msg_len = . -msg

	newline:
		.string "\n"

.section .text
	.globl _start

_start:
	//Xuat msg
	movl $4, %eax
	movl $msg_len, %edx
	movl $msg, %ecx
	movl $1, %ebx
	int $0x80

	//Nhap input1
	movl $3, %eax
	movl $1, %edx
	movl $input1, %ecx
	movl $0, %ebx
	int $0x80
	
	//doc /n vao dum
	movl $3, %eax
	movl $1, %edx
	movl $dum, %ecx
	movl $0, %ebx
	int $0x80

	//Xuat msg
        movl $4, %eax
        movl $msg_len, %edx
        movl $msg, %ecx
        movl $1, %ebx
        int $0x80

        //Nhap input2
        movl $3, %eax
        movl $1, %edx
        movl $input2, %ecx
        movl $0, %ebx
        int $0x80

	//doc /n vao dum
        movl $3, %eax
        movl $1, %edx
        movl $dum, %ecx
        movl $0, %ebx
        int $0x80

	//Xuat msg
        movl $4, %eax
        movl $msg_len, %edx
        movl $msg, %ecx
        movl $1, %ebx
        int $0x80

        //Nhap input3
        movl $3, %eax
        movl $1, %edx
        movl $input3, %ecx
        movl $0, %ebx
        int $0x80

	//doc /n vao dum
        movl $3, %eax
        movl $1, %edx
        movl $dum, %ecx
        movl $0, %ebx
        int $0x80

	//Xuat msg
        movl $4, %eax
        movl $msg_len, %edx
        movl $msg, %ecx
        movl $1, %ebx
        int $0x80

        //Nhap input4
        movl $3, %eax
        movl $1, %edx
        movl $input4, %ecx
        movl $0, %ebx
        int $0x80

	//doc /n vao dum
        movl $3, %eax
        movl $1, %edx
        movl $dum, %ecx
        movl $0, %ebx
        int $0x80

	//%al = 0
	add $0, %al

	//calculate
	//step 1: convert char to num
	//step 2: add to %al
	//repeat
	mov (input1), %cl
	sub $'0', %cl
	add %cl, %al
	mov (input2), %cl
	sub $'0', %cl
	add %cl, %al
	mov (input3), %cl
	sub $'0', %cl
	add %cl, %al
	mov (input4), %cl
	sub $'0', %cl
	add %cl, %al
	
	//div 4
	sar $2, %al

	//convert num to numchar
	add $'0', %al

	mov %al, (result)

	//display result
	movl $4, %eax
	movl $1, %edx
	movl $result, %ecx
	movl $1, %ebx
	int $0x80

	jmp _exit

_exit:
	movl $1, %eax
	int $0x80

.section .bss
	.lcomm input1, 1
	.lcomm input2, 1
	.lcomm input3, 1
	.lcomm input4, 1
	.lcomm result, 1
	.lcomm dum, 1
