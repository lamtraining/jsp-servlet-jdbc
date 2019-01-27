$(document).ready(function () {
    $('input[type="checkbox"]').click(function () {
        if ($(this).is(':checked')) {
            $('#deleteAll').prop('disabled', false);
        } else {
            $('#deleteAll').prop('disabled', true);
        }
    });
    //check all list checkbox
    $("#checkAll").change(function () {
        $("input[type='checkbox']").prop('checked', $(this).prop("checked"));
    });
});