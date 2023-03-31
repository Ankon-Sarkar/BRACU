.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
       
        ;input
        MOV AH,1
        INT 21H
        SUB AL,30H
        MOV CL,AL  ; row
        
        ;move to nextline
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        
        MOV BH,1    ;i=1
        outer_loop: ; for row [i=1;i<=input row]
        CMP BH,CL
        JG EXIT
        
        MOV BL,0      
        MOV CH,CL
        SUB CH,BH 
        
        SPACE_PRINT: ;[j<=input row-i]      ;1st inner loop
        CMP BL,CH
        JGE c1
        MOV AH,2  
        MOV DL,20H
        INT 21H
        INC BL          ;space counter
        JMP SPACE_PRINT
        
        
        
        c1:
        MOV DH,1  ;j=1
        MOV CH,0
       
        A:       ; 2nd inner loop
       
        CMP DH,BH   ;[j<=`i]
        JG NEXTLINE
       
        CMP DH,1     ;(j==1)
        JE PRINT_NUM
        
        
       
        CMP BH,CL     ;[i==input row]
        JE PRINT_NUM
        
        
        
        CMP BH,DH     ;[i==j]
        JE PRINT_NUM
        
        MOV AH,2  
        MOV DL,20H
        INT 21H
        INC DH
        INC CH
        JMP A
         
      
        ;JMP outer_loop
        
        
        PRINT_NUM: 
        MOV DL,CL
        SUB DL,BL  ;input row-space
        SUB DL,CH
        ADD DL,30H
        INT 21H
        INC CH
        INC DH
        JMP A    

        
        NEXTLINE:
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        INC BH
        JMP outer_loop
        
        ; YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
