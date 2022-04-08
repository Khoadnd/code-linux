.section .data
  msg:
    .string "Enter a string\n"
  msg_len = . - msg

.section .bss
  .lcomm input, 5
  .lcomm output, 5

.section .text
  .globl _start

_start:

  // print msg
  movl $4, %eax
  movl $msg_len, %edx
  movl $msg, %ecx
  movl $1, %ebx
  int $0x80


  // read a string with a maximum length of 5
  movl $3, %eax
  movl $0, %ebx
  movl $5, %edx
  movl $input, %ecx
  int $0x80

  // reverse input
  movl $input, %eax
  movl $output, %ecx
  mov 4(%eax), %bl
  mov %bl, 0(%ecx)
  mov 3(%eax), %bl
  mov %bl, 1(%ecx)
  mov 2(%eax), %bl
  mov %bl, 2(%ecx)
  mov 1(%eax), %bl
  mov %bl, 3(%ecx)
  mov 0(%eax), %bl
  mov %bl, 4(%ecx)


  // print result
  movl $4, %eax
  movl $0, %ebx
  movl $5, %edx
  movl $output, %ecx
  int $0x80




  // exit
  movl $1, %eax
  int $0x80

