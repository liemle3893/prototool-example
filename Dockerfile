FROM uber/prototool:1.8.0
RUN apk update && \
	apk add --no-cache grpc-java

CMD ["/bin/sh"]
