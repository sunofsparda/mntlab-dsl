job('DSL-Tutorial-1-Test') {
    scm {
        git('https://github.com/MNT-Lab/mntlab-dsl')
    }
    triggers {
        scm('H/15 * * * *')
    }
   // steps {
    //    maven('-e clean test')
    //}
}