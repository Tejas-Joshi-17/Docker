
try:
    with open('servers.txt','r') as file:
        content = file.readlines()
except Exception as e:
    print(e, type(e))
else:
    for line in content:
        print(f'{line.rstrip()}')

# docker run -v /home/sarvatra.in/tejas.joshi/Documents/Docker/Project_4/servers.txt:/myapp/servers.txt --rm python-docker:03
# 1) As soon as data inside servers.txt changes data inside servers.txt present in container is also changes
# 2) No Volume Created