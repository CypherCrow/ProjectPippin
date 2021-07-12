<template> 
    <div class="DeliveryMap">
        <div class="MapHeaderSection">
            <h3>Delivery Map</h3>
        </div>

        <div class="DeliveryMapSection"> 
            <div id="map" style="width: 400px; height: 300px"></div> 
        </div> 
    </div> 
</template>

<script>
import GoogleMapsLoader from 'google-maps'

export default {
    name: "DeliveryMap",
    mounted() {
        GoogleMapsLoader.load((google) => {
            this.map = new google.maps.Map(document.getElementById("map"), {
                zoom: 15, 
                center: {lat: -83.022206, lng: 39.998264}
            })
        })
    }
}
</script>
