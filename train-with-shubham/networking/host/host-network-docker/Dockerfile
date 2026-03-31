FROM amazoncorretto:17

WORKDIR /host-network-docker

RUN yum install -y less more unzip tar gzip grep \
    && yum install -y tzdata \
    && yum install -y procps-ng \
    && ln -sf /usr/share/zoneinfo/Aisa/Kolkata /etc/localtime \
    && echo "Asia/Kolkata" > /etc/timezone

COPY ./build/install/host-network-docker .

#ENTRYPOINT ["bash", "docker-start.sh"]
