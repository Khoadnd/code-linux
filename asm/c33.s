.section .data
  msg: 
    .string "Enter a year "
  msg_len = . - msg

  msg2:
    .string "Your age is: "
  msg2_len = . - msg2

  msg3:
    .string "Can't be in Ho Chi Minh Communist Youth Union"
  msg3_len = . - msg3

  msg4:
    .string "Can be in Ho Chi Minh Communist Youth Union"
  msg4_len = . - msg4

  // age must between 16 and 30


.section .bss
  .lcomm input, 4

.section .text
  .globl _start

_start:
  // print msg
  movl $4, %eax
  movl $msg_len, %edx
  movl $msg, %ecx
  movl $1, %ebx
  int $0x80

  // read input
  movl $3, %eax
  movl $0, %ebx
  movl $4, %edx
  movl $input, %ecx
  int $0x80


  // convert input from numchar to num
  movl (input), %eax
  xor %ebx, %ebx
  mov 0(%eax), %cl
  sub $0, %cl
  mov %cl, 0(%ebx)
  mov 1(%eax), %cl
  sub $0, %cl
  mov %cl, 1(%ebx)
  mov 2(%eax), %cl
  sub $0, %cl
  mov %cl, 2(%ebx)
  mov 3(%eax), %cl
  sub $0, %cl
  mov %cl, 3(%ebx)

  // check

  cmpl $16, %ebx
  jl _false
  cmpl $30, %ebx
  jg _false
  
  movl $msg4, %ecx
  movl $msg4_len, %edx
  movl $4, %eax
  movl $1, %ebx
  int $0x80
  jmp _exit
  
_false:

  // print input
  movl $4, %eax
  movl $msg3_len, %edx
  movl $msg3, %ecx
  movl $1, %ebx
  int $0x80


_exit:
  movl $1, %eax
  int $0x80
