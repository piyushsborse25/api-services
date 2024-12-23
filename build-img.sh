#!/bin/bash

#cd /home/piyush/Documents/projects/Container

docker build -t piyushsborse/git-container-service:latest -f Dockerfile .

#docker stop piyushsborse/git-container-service

docker run -d -p 8087:8087 piyushsborse/git-container-service
