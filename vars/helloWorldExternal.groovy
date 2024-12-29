def call(Map config = [:]){
    loadWindowsScript(name: 'hello-world.bat')
    bat "hello-world.bat ${config.name} ${config.dayOfWeek}"
}