node{
    stage("Deploy ") {
    def command = '''
    ls -ltr
    cd 
    cat tt.txt
    #mkdir kk
    
    '''
    def execute_state=sh(returnStdout: true, script: command)
    

}
}
