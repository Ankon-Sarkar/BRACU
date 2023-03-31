.MODEL SMALL  

.STACK 100H  

.DATA
    ; DEFINE YOUR VARIABLES HERE 
    p1 DB "1st side: $"  
    p2 DB "2nd side: $" 
    p3 DB "3rd side: $" 
    
    yes DB "Y $"  
    no DB "N $"


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
        
        
        ;input 3rd
        LEA DX,p3
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        MOV CL,AL  ;CL=3RD
        SUB CL,30H
        
        MOV AH, 2                    
        MOV DL, 0DH          
        INT 21H
        MOV DL, 0AH
        INT 21H 
        
        
        ;CHECK 1st+2nd>3rd
        MOV CH,BL
        ADD CH,BH
        CMP CH,CL
        JLE NOT_TRINGLE  
        
        ;CHECK 1ST+3RD>2ND
        MOV CH,BL
        ADD CH,CL
        CMP CH,BH
        JLE NOT_TRINGLE 
        
        ;CHECK 2ND+3RD>1ST
        MOV CH,BH
        ADD CH,CL
        CMP CH,BL
        JLE NOT_TRINGLE 
        
        LEA DX,yes
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        JMP EXIT
        
        NOT_TRINGLE: ; 
        LEA DX,no
        MOV AH,9
        INT 21h 
        MOV AH,1
        INT 21H
        
        ; YOUR CODE ENDS HERE
        EXIT:
        MOV AX, 4C00H
        INT 21H
        
    MAIN ENDP
    END MAIN
