FROM amazoncorretto:17

WORKDIR /bridge-network-docker

RUN yum install -y less more unzip tar gzip grep \
    && yum install -y tzdata \
    && yum install -y procps-ng \
    && ln -sf /usr/share/zoneinfo/Aisa/Kolkata /etc/localtime \
    && echo "Asia/Kolkata" > /etc/timezone

COPY ./build/install/bridge-network-docker .

ENTRYPOINT ["bash", "docker-start.sh"]
#ENTRYPOINT ["cd" , "/bridge-network-docker""]
#CMD ["pwd .."]
