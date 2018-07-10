for(i in 0..4) {
  job("jobDSLCreated-${i}"){
  scm {
    git "https://github.com/vinitkumargoel/jenkin_l${i}"
  }
 }
}