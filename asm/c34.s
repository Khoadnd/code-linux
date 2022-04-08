.section .data
  msg:
    .string = "A"
  msg_len = . - msg

.section .text
  .globl _start

_start:

  movl $4, %eax
  movl $msg_len, %edx
  movl $msg, %ecx
  movl $1, %ebx
  int $0x80

  movl $1, %eax
  int $0x80