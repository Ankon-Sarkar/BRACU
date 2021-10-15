.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE
    p1 DB "1st input: $"  
    p2 DB "2nd input: $" 
    p3 DB "3rd input: $"

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
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        
        
        ;input 3rd
        LEA DX,p3
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV CL,AL  ;CL=3RD
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH
        INT 21H
        
        
        CMP BL,BH     ;IF(1ST NUM>2ND NUM)
        JG CONDITION1
        CMP BH,CL      ;IF(2ND NUM>3RD NUM)
        JG CONDITION2
        JMP CONDITION4 
        
        
        
        
        CONDITION1:     ;IF(1ST NUM>3RD NUM)
        CMP BL,CL
        JG CONDITION3
        JMP CONDITION4
        
        
        CONDITION2:  ;PRINT MAX=2ND NUM
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        MOV AH,2
        MOV DL,BH
        INT 21H
        JMP EXIT
        
        
        CONDITION3: ;PRINT MAX=1ST NUM
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        MOV AH,2
        MOV DL,BL
        INT 21H
        JMP EXIT
        
        CONDITION4:           
        MOV AH, 2   ;PRINT MAX=3RD NUM                   
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH               
        INT 21H
        MOV AH,2
        MOV DL,CL
        INT 21H
        
         
        
        ; YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
