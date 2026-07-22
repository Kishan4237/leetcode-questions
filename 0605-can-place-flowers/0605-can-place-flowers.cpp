class Solution {
public:
    bool canPlaceFlowers(vector<int>& flowerbed, int n) {

        bool left = false;;
        bool right = false;

        int cnt = 0;

        for(int i = 0; i < flowerbed.size(); i++){

            if(flowerbed[i] == 0){

                left = (i == 0) || (flowerbed[i - 1] == 0);
                right = (i == flowerbed.size() - 1) || (flowerbed[i + 1] == 0);

                if( left && right){
                    flowerbed [i] = 1;
                    cnt ++ ;

                    if(cnt >= n){
                        return true;
                    }
                }
                
                
            }
        }

        return cnt >= n;
        
    }
};