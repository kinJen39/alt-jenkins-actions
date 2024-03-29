FROM ubuntu:latest
# Comment to make push
MAINTAINER Angello Maggio "angellom@jfrog.com"
RUN apt-get update -y

# Another comment to make a pull request from jen branch
RUN apt-get install -y python3-pip python3 build-essential
ADD . /flask-app
WORKDIR /flask-app
# Another comment to make a pull request from jena branch, second try, third try, fourth try
RUN pip install -r requirements.txt
ENTRYPOINT ["python"]
CMD ["flask-docker.py"]
