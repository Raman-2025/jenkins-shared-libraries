//define function 
def call( String ProjectName, String ImageTag, Sting DockerHubUser ){
  sh 'docker build -t  ${DockerHubUser}/${ProjectName}:${ImageTag} . '
}
