
# FROM node         <---- Use Latest version of node
# Use node-20 version
FROM node:20       

#Creare Folder 'myapp' inside container in which image is their
WORKDIR /myapp              

# copy all files present in current folder in which Dockerfile present in image 
COPY . .                    

# execute while creating image
RUN npm install             

# Debugging step to check npm and node installation
RUN node -v && npm -v

# Image is running at port:3000 inside container
EXPOSE 3000

# while running image this commands must be run
CMD npm start    
