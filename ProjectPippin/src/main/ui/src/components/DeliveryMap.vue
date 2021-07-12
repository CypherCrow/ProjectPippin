<template> 
    <div class="DeliveryMap">
        <div class="MapHeaderSection">
            <h3>Delivery Map</h3>
        </div>

        <div class="DeliveryMapSection"> 

        </div> 
    </div> 
</template>

<script>


export default {
    name: "DeliveryMap",
    mounted(){
        this.$loadScript("http://maps.google.com/maps?file=api&v=1&key=AIzaSyC5kZUpghzaI40k5JixW2cSHI3mrYv1NTM")
            .then(() => {
                console.log("Google Maps script loaded successfully")
            })
            .catch(() => {
                console.log("Failed to load Google Map script")
            })
    }
}
</script>
