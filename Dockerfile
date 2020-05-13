FROM java:8
COPY /build/libs/retocapacitacionbackend.jar retocapacitacionbackend.jar
ENTRYPOINT ["java","-jar","retocapacitacionbackend.jar"]
