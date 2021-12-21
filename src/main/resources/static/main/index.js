const paralex=document.getElementById('paralex');
const oldstate= parseInt(''+$('#paralex').css('background-position-y'));
// console.log(oldstate);
window.addEventListener("scroll",function(){
    let y=window.pageYOffset;
    // console.log(y);
    if(y<1180){
        paralex.style.backgroundPositionY=(oldstate-(y*0.1))+"%";
    }

    // paralex.style.backgroundPositionY=(20+(y*0.6))+"%";
    // pdf.style.backgroundPositionY=(y*0.6)+"px";
});



