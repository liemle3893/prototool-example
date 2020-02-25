DIR:=$(shell dirname $(realpath $(firstword $(MAKEFILE_LIST))))
GEN_DIR=${DIR}/src
ALIVE_ARTIFACTORY_DEPLOYER=
ALIVE_ARTIFACTORY_DEPLOYER_PASWORD=
DEPLOY_VERSION=

.PHONY: clean gen dist

clean: clean-java clean-go clean-swagger

clean-java:
	@rm -rf ${GEN_DIR}/java/src
clean-go:
	@rm -rf ${GEN_DIR}/go
clean-swagger:
	@rm -rf ${GEN_DIR}/swagger
gen:
	docker run -v "$(DIR):/work" saboteurkid/prototool_java:1.8.0 prototool generate
dist:
	cd ${GEN_DIR}/java && ./gradlew clean bintrayUpload -DdeployVersion=${DEPLOY_VERSION} -Dusername=${ALIVE_ARTIFACTORY_DEPLOYER} -Dpassword=${ALIVE_ARTIFACTORY_DEPLOYER_PASWORD}

