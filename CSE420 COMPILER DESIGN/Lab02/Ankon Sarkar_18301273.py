caution = ('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '.', '@', '/' '&')
#function of checking a valid email
def check_email(word):

    local_part = ''
    domain_part = ''

    if(word.count('@')==1):
        splited_word = word.split('@')
        local_part= splited_word[0]
        domain_part = splited_word[1]

        # only if both are true returns true
        return localpart_checker(local_part) and  domainpart_checker(domain_part)

    else:
        return False

#check validity of email's local part
def localpart_checker(first_part):
    flag1=True
    if (not first_part.startswith(caution) and (len(first_part) <= 64) and (not first_part.endswith('.'))):
    # check consequetive(.)
        for i in range(0, len(first_part) - 1):
            if (first_part[i] == '.' and first_part[i+1] == '.'):
                flag1=False
                break
        return flag1

    else:
        return False

# check validity of email's domain part
def domainpart_checker(last_part):
    flag2 = True
    special_characters=['*','%',',','+','?','_','#']
    if (last_part.count('.') >= 1):

        # split the domain in 2 parts based on .
        split=last_part.split('.')
        extension=split[-1] # extract extension

        if( len(last_part)<=256 and not extension.startswith('-') and not extension.endswith('-') and extension!=""):
            temp=list(last_part)
       #check whether domain contains any special character
            for char in temp:
                if (char in special_characters):
                    flag2 = False
                    break
            return flag2
    else:
        return False



#function to check valid web address
def check_web(address):
    protocol_hostname=('http//www', 'https//www', 'www')
    split = address.split(".") #split the web
    special_characters = ['*', '%', ',', '+', '?', '_', '#']
    flag3=True

    if(address.startswith(protocol_hostname) and len(split)>=3):
        name=split[-2]
        extension=split[-1]
        if (not name.startswith(" ") and not extension.startswith("-") and not extension.endswith("-")):
            temp=list(address)
            # check whether address contains any consequetive special character
            for i in range(0,len(temp)-1):
                if(i in special_characters and address[i]==address[i+1]):
                    flag3=False
                    break
            return flag3

    else:
        return False




# driver code
n = int(input())
string = []
for i in range(1, n + 1):
    text = input()
    string.append(text)

output=[]
counter=1
for x in string:
    if(check_email(x)):
        output.append("Email "+ str(counter))

    if(check_web(x)):
        output.append("Web "+str(counter))

    counter=counter+1

# print output
for i in output:
    print(i)








