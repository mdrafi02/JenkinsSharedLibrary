def call(Map config = [:]){
    loadWindowsScript(name: 'hello-world.bat')
    bat "./hello-word.bat ${config.name} ${config.dayOfWeek}"
}