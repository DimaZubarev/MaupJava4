// setTimeout, setInterval
        // tag - куди виводяться часи
        function clock(tag){
        var d = new Date();
        var h = d.getHours();
        h = h <10 ? "0" + h: h;
        var m = d.getMinutes();
        m = m <10 ? "0" + m: m;
        var s = d.getSeconds();
        s = s <10 ? "0" + s: s;
        tag.innerHTML = h + ":" + m + ":" + s;
        setTimeout(clock, 1000,tag);
        }
        function difDate(d1, d2){
        var obj = {};
        var ms = d2.getTime() - d1.getTime();
        obj.ms = ms % 1000;
        var s = Math.floor(ms / 1000);
        obj.s = s % 60;
        var m = Math.floor(s / 60);
        obj.m = m % 60;
        var h = Math.floor(m/60);
        obj.h = h % 24;
        obj.d = Math.floor(h / 24);
        return obj;
        }