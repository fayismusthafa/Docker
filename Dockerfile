#use openjdk 11 as base image
FROM openjdk:17
#create app directory for my application files
RUN mkdir /app
#copy files from host machine to image file system
COPY out/production/HelloJavaDocker/ /app
#set directory for executing future commands
WORKDIR /app
#Run the main class
CMD java Main