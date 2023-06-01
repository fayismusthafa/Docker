This is a dockerized java Hello world application 
Follow these steps to create an image for the application and to run it:
    #Open the source code in intellij idea
    #Compile the java code to generate .class files

    #Generate the docker image using command: "docker build -t java-docker-helloworld:1.0 . "
        where java-docker-helloworld:1.0 is the tag name(image name)

    #To list all the docker images, run "docker images"

    #Run the docker image using the command: "docker run java-docker-helloworld:1.0"

    #You can see the "Hello World!" and iteration count printing in console.
