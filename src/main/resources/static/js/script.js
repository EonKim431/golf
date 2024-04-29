function updateTuition() {
    var tuitionSelect = document.getElementById("className");
    var tuitionPrice = document.getElementById("tuitionPrice");
    var memberIdSelect = document.getElementById("memberIdSelect");
    var memberIdInput = document.getElementById("memberIdInput");
    var teacherInput = document.getElementById("teacherInput"); // 추가된 hidden 필드

    // 선택된 강의명의 value 값을 가져와서 강의료 필드에 설정합니다.
    var tuition = tuitionSelect.value;
    tuitionPrice.value = tuition;

    // 선택된 회원명의 value 값을 가져와서 회원번호 필드에 설정합니다.
    var selectedMemberId = memberIdSelect.value;
    memberIdInput.value = selectedMemberId;

    // 선택된 강의명의 강사 정보를 hidden 필드에 설정합니다.
    var selectedTeacher = tuitionSelect.options[tuitionSelect.selectedIndex].getAttribute('data-teacher');
    teacherInput.value = selectedTeacher;

    // 회원의 grade를 확인하여 VIP 여부를 결정하고 수강료를 조정합니다.
    var selectedMemberGrade = memberIdSelect.options[memberIdSelect.selectedIndex].getAttribute('data-grade');
    if (selectedMemberGrade === "VIP") {
        tuitionPrice.value = parseInt(tuitionPrice.value) / 2;
    } // 이 부분이 누락되었습니다.
}

function updateMemberId() {
    var memberIdSelect = document.getElementById("memberIdSelect");
    var memberIdInput = document.getElementById("memberIdInput");

    // 선택된 회원명의 value 값을 가져와서 회원번호 필드에 설정합니다.
    var selectedMemberId = memberIdSelect.value;
    memberIdInput.value = selectedMemberId;
}

function res(){
    alert("처음부터 다시 입력합니다")
    document.getElementById("frm").reset()
}