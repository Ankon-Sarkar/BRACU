.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
         
        ;1ST INPUT
        MOV AH,1
        INT 21H
        SUB AL,30H
        MOV BH,AL
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        ;2ND INPUT
        MOV AH,1
        INT 21H
        SUB AL,30H
        MOV CL,AL 
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        
        MOV BL,2
        
        REPEAT:
        CMP BH,CL  ;LOOP CONDITION
        JG EXIT 
        MOV AX,1
        MUL BH
        DIV BL
        INC BH
        CMP AH,1
        JE REPEAT ;if not divisible by 2 jump to check next
        
       ; else print
        MOV AH,2
        DEC BH
        MOV DL,BH
        ADD DL,30H
        INT 21H
        INC BH
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H 
        JMP REPEAT
         
        
        
        
        ; YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
