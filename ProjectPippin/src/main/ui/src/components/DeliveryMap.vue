<template> 
    <div class="DeliveryMap">
        <div class="MapHeaderSection">
            <h3>Delivery Map</h3>
        </div>

        <div class="DeliveryMapSection"> 
            <GoogleMap 
                api-key="AIzaSyC5kZUpghzaI40k5JixW2cSHI3mrYv1NTM"
                style="width: 500px; height: 450px; padding: 5px; margin-left: 9%;"
                :center="center"
                :zoom="15"></GoogleMap>
        </div> 
    </div> 
</template>

<script>

import { GoogleMap } from 'vue3-google-map'

export default {
    name: "DeliveryMap",
    components: {
        GoogleMap 
    },
    setup(){
        const center = { lat: 40.689247, lng: -74.044502 }

        return center
    }
}
</script>

<style scoped> 

.DeliveryMap {
    width: 600px; 
    max-width: 600px;
    height: 550px; 
    max-height: 550px;
    text-align: center; 
}


</style> 
