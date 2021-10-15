.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE
    p1 DB "1st input: $"  
    p2 DB "2nd input: $"
    O1 DB "Divisible $"
    O2 DB "Not divisible $"

.CODE
    MAIN PROC
        
        MOV AX, @DATA
        MOV DS, AX
        
        ; YOUR CODE STARTS HERE
       
       ;input 1st
        LEA DX,p1
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV BL,AL  ;BL=1ST
        SUB BL,30H
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        ;input 2nd
        LEA DX,p2
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV BH,AL ;BH=2ND
        SUB BH,30H
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        
        ;MULTIPILICATION
        MOV AL,BL
        MUL BH 
        
        MOV CX,AX
        
        
        MOV BH,1
        MOV BL,2
        DIV BL ;DIVISION BY 2
        
        CMP AH,BH
        JL CONDITION1
        
       
        
        CONDITION1: 
        MOV BL,3H
        MOV AX,CX
        DIV BL ;DIVISION BY 3
        
        CMP AH,BH
        JL CONDITION2 
        
        ;IF NOT DIVISIBLE BY BOTH 2 & 3
        LEA DX,O2
        MOV AH,9
        INT 21h
        JMP EXIT
      
        
        CONDITION2:  ;IF DIVISIBLE BY BOTH 2 & 3
        LEA DX,O1
        MOV AH,9
        INT 21h 
         
        
        
        
        
        
        ; YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
