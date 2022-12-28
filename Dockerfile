FROM ubuntu:latest
# Comment to make push
MAINTAINER Angello Maggio "angellom@jfrog.com"
RUN apt-get update -y
RUN apt-get install -y python3-pip python3 build-essential
ADD . /flask-app
WORKDIR /flask-app
RUN pip install -r requirements.txt
ENTRYPOINT ["python"]
CMD ["flask-docker.py"]
