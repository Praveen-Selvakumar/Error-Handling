package com.example.errorhandling.registration

import org.junit.Test


class RegistrationUtilTest {

    @Test
    fun `name is less that 3 return false`() {
        val result = RegistrationUtil().isDetailsValid(name = "Praveen", password = "123", confirmPassword = "123")
        assert(result)
    }


    @Test
    fun `password is not equal return false`(){
        val  result = RegistrationUtil().isDetailsValid(name = "Praveen Selvakumar",password = "123", confirmPassword = "123")
        assert(result)
    }

    @Test
    fun `pass testcase if all are valid`(){
        val result = RegistrationUtil().isDetailsValid(name = "Praveen Selvakumar", password =  "uumai007", confirmPassword = "uumai007")
        assert(result)
    }

}