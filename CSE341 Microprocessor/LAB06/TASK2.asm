.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE 
    P1 DB "Enter Three Numbers: $"  
    P2 DB "Largest number: $"
    MAX DB "?"
    NUMS DB 5 DUP (?)

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
        LEA DX,P1
        MOV AH,9
        INT 21h 
        
        MOV CX,5
        LEA SI,Nums
        MOV AH,1
        
        INPUT:
        INT 21H
        SUB AL,30H
        MOV [SI],AL 
        
        INC SI
        LOOP INPUT
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        LEA DX,P2
        MOV AH,9
        INT 21h 
        MOV SI,0
        MOV BL,NUMS[SI] 
        MOV MAX,BL
        MOV CL,0
        
        FIND_MAX:
        CMP CL,3
        JE EXIT
        MOV BH,NUMS[SI]
        CMP BL,BH
        JL C1
        INC CL
        ADD SI,2
        JMP FIND_MAX
        
        
        C1:
        MOV MAX,BH
        INC CL
        ADD SI,2
        JMP FIND_MAX  
         
         
        
        ; YOUR CODE ENDS HERE
        EXIT: 
        MOV AH,2
        MOV DL,MAX
        ADD DL,30H
        INT 21H
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
