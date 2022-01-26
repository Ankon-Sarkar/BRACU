.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE
        
        
      feb DB "28 $"
      R1 DB "31 $" 
      R0 DB "30 $"
.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE 
        
        ;INPUT
        MOV AH,1
        INT 21H
        SUB AL,30H
        MOV BL,AL
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        CMP BL,2
        JE FEBRUARY
        
        MOV AX,1
        MUL BL
        
        MOV BL,2
        DIV BL
        
        CMP AH,0
        JG CONDITION1
        
        
        LEA DX,R0 ;IF INPUT!=2 & DIVISIBLE BY 2 PRINT 30
        MOV AH,9
        INT 21h
        JMP EXIT
        
        CONDITION1: ;NOT DIVISIBLE BY 2 PRINT 31
        LEA DX,R1
        MOV AH,9
        INT 21h
        JMP EXIT
          
        
        FEBRUARY: ;IF FEBRUARY PRINT 28
        LEA DX,feb
        MOV AH,9
        INT 21h
        
        ; YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
