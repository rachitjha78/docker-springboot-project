# docker-springboot-project
This project demo how  to dockerized  the springboot application

Following are the commonds whhich will build and pusg the Docker image to repo


---------Build Docker Image----------------

docker build -f Dockerfile -t docker-springboot .

--------Commit  image to docker Hub-----------

docker commit *containerId* rachitjha/docker-springboot:2

------Push to docker repository---------------

docker push rachitjha/docker-springboot:2


---------Installl and run docker image localy--------

docker run -p 8086:8082 rachitjha/docker-springboot:2
