// 表单校验
function check_username(obj) {
    if (obj == '' || obj == "") {
        $("#sp-username").html("该输入框不能为空!!!")
    } else {
        $("#sp-username").html("")
    }
}

function check_password(obj) {
    if (obj == '' || obj == "") {
        $("#sp-password").html("该输入框不能为空!!!")
    } else {
        $("#sp-password").html("")
    }
}

function check_email(obj) {
    if (obj == '' || obj == "") {
        $("#sp-email").html("该输入框不能为空!!!")
    } else {
        $("#sp-email").html("")
    }
}

// 显示密码
function show_password() {
    $("#ipt-password").attr("type", "text")
}
// 隐藏密码
function hide_password() {
    $("#ipt-password").attr("type", "password")
}
