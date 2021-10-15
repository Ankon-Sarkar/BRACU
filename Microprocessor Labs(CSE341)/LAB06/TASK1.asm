.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE
    P1 DB "Enter Name: $"  
    P2 DB "Output: $"
    N DB 12 DUP (?)
    

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
        LEA DX,P1
        MOV AH,9
        INT 21h 
        
        MOV CX,12
        LEA SI,N
        MOV AH,1
        
        INPUT:
        INT 21H
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
        LEA SI,N
        
        TRAVERSE:
        CMP CL,12
        JE EXIT
         
        MOV BL,[SI]
        CMP BL,20H
        JE SPACE
        CMP BL,5AH
        JG SMALL 
        ADD BL,20H
        JMP PRINT
        
        
        SPACE:
        MOV AH,2
        MOV DL,BL
        INT 21H
        INC CL
        INC SI
        JMP TRAVERSE
        
        SMALL:
        SUB BL,20H
        JMP PRINT
        
        
        
        
        PRINT:
        MOV [SI],BL
        MOV AH,2
        MOV DL,BL
        INT 21H 
        INC CL
        INC SI
        JMP TRAVERSE
        
        
        
        ; YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
