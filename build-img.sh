#!/bin/bash

cd /home/piyush/Documents/projects/Container

docker build -t piyushsborse/automated-service:latest -f Dockerfile .

docker run -d -p 8080:8080 piyushsborse/automated-service:latest
