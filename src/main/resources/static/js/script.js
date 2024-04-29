function updateTuition() {
    var tuitionSelect = document.getElementById("className");
    var tuitionPrice = document.getElementById("tuitionPrice");
    var memberIdSelect = document.getElementById("memberIdSelect");
    var memberIdInput = document.getElementById("memberIdInput");
    var teacherInput = document.getElementById("teacherInput");

    var tuition = tuitionSelect.value;
    tuitionPrice.value = tuition;

    var selectedMemberId = memberIdSelect.value;
    memberIdInput.value = selectedMemberId;

    var selectedTeacher = tuitionSelect.options[tuitionSelect.selectedIndex].getAttribute('data-teacher');
    teacherInput.value = selectedTeacher;

    var selectedMemberGrade = memberIdSelect.options[memberIdSelect.selectedIndex].getAttribute('data-grade');
    if (selectedMemberGrade === "VIP") {
        tuitionPrice.value = parseInt(tuitionPrice.value) / 2;
    }
}

function updateMemberId() {
    var memberIdSelect = document.getElementById("memberIdSelect");
    var memberIdInput = document.getElementById("memberIdInput");

    memberIdInput.value = memberIdSelect.value;
}

function res(){
    alert("처음부터 다시 입력합니다")
    document.getElementById("frm").reset()
}