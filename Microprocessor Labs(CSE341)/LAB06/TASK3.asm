.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE
    P1 DB "Enter Numbers: $"
    P2 DB "OUTPUT: $" 
    ARRAY DB 5 DUP (?)

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
        LEA DX,P1
        MOV AH,9
        INT 21h 
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        MOV CX,5
        LEA SI,ARRAY
        
        
        INPUT:
        MOV AH,1
        INT 21H
        SUB AL,30H
        MOV [SI],AL
        
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        INC SI
        
        
        LOOP INPUT 
        
        MOV CL,0
        
        
        SORT:    ;BUBBLE SORT
        CMP CL,5
        JGE OUTPUT
        MOV CH,0
        MOV SI,0
        
        INNER:
        CMP CH,4
        JGE C1
        MOV BX,SI
        ADD BX,1
        MOV DL,ARRAY[SI]
        MOV DH,ARRAY[BX]
        CMP DL,DH
        JG SWAP
        INC SI
        INC CH
        JMP INNER
        
        
        SWAP:
        MOV AL,ARRAY[SI]
        MOV AH, ARRAY[BX]
        MOV ARRAY[SI],AH
        MOV ARRAY[BX],AL
        INC SI
        INC CH
        JMP INNER 
        
         C1:
         INC CL
         JMP SORT
        
        OUTPUT:
        LEA DX,P2
        MOV AH,9
        INT 21h  
        
        MOV CX,5
        LEA SI,ARRAY
        MOV AH,2
        
        PRINT:
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        MOV DL,[SI]
        ADD DL,30H
        INT 21H
        INC SI
        
        
        LOOP PRINT 
        
         
         
        
        ;YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
