def call(String url, String branch){
            echo 'This is cloning the code'
            // first way 
            // git url: url, branch: branch
            // second way
            git url: '$(url)' ,branch: '$(branch)'
            echo 'code clone successful'
}
