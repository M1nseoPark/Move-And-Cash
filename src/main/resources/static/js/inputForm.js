function showPopup(multipleFilter) {
    const popup = document.querySelector('#popup');

    if (multipleFilter) {
        popup.classList.add('multiple-filter');
    } else {
        popup.classList.remove('multiple-filter');
    }

    popup.classList.remove('hide');
}

function pickPopup(obj) {
    const popup = document.querySelector('#popup');
    var result = document.getElementById("result");
    var text = obj.innerHTML;

    result.value = text
    popup.classList.add('hide');
}

function change_btn(e) {
    var btns = document.querySelectorAll("input[type=button]");
    btns.forEach(function (btn, i) {
        if (e.currentTarget == btn) {
            btn.classList.add("active");
        } else {
            btn.classList.remove("active");
        }
    });
    console.log(e.currentTarget);
}