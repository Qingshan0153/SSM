window.onload = function () {

    const vue = new Vue({
        el: "#all_list",
        data: {
            allInfo: {}
        },
        methods: {
            getInfo: function () {
                axios({
                    method: 'get',
                    url: 'employee',

                }.then(function (value) {
                    console.log(value.data)
                }).catch());
            }
        },
        mounted: function () {
            vue.getInfo();
        }
    });

}