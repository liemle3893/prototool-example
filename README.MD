
# Example for sharing and oganising protobuf (grpc as well).

# Step 1: Clone this repository

```shell
$ git clone https://github.com/liemle3893/prototool-example && cd prototool-example
```

# Step 2: Generate protobuf/grpc
```shell
$ docker run --rm -it -v "$(pwd):/work" saboteurkid/prototool_java:1.8.0 prototool generate
```
Where `1.8.0` is prototool version.

For more options please type:
```shell
$ docker run --rm -it saboteurkid/prototool_java:1.8.0 prototool help
```
