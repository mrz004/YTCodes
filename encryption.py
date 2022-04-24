str = ''' abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()_+\|[]{};'":`,./<>?'''
msg = input("Enter the string to encrypt : ")
key = int(input("Enter the key to encrypt the message : "))
encr = ""
for index, i in enumerate(msg):
    encr += str[(str.find(i)+key)%len(str)]
print(encr)
