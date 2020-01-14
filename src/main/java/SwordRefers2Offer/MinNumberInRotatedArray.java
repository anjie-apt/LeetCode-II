package SwordRefers2Offer;


/**
 * °ÑÒ»¸öÊı×é×î¿ªÊ¼µÄÈô¸É¸öÔªËØ°áµ½Êı×éµÄÄ©Î²£¬ÎÒÃÇ³ÆÖ®ÎªÊı×éµÄĞı×ª¡£
 ÊäÈëÒ»¸ö·Çµİ¼õÅÅĞòµÄÊı×éµÄÒ»¸öĞı×ª£¬Êä³öĞı×ªÊı×éµÄ×îĞ¡ÔªËØ¡£
 ÀıÈçÊı×é{3,4,5,1,2}Îª{1,2,3,4,5}µÄÒ»¸öĞı×ª£¬¸ÃÊı×éµÄ×îĞ¡ÖµÎª1¡£
 NOTE£º¸ø³öµÄËùÓĞÔªËØ¶¼´óÓÚ0£¬ÈôÊı×é´óĞ¡Îª0£¬Çë·µ»Ø0¡£
 */
public class MinNumberInRotatedArray
{
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        int start = 0;
        int end = array.length - 1;
        int mid = start;
        while (array[start] >= array[end]){
            if (end - start == 1){
                mid = end;
                break;
            }
            mid = (end + start) / 2;
            if (array[start]==array[end] && array[mid]==array[start]){
                return MinInOrder(array, start, end);
            }
            if (array[mid] >= array[start]) start = mid;
            else if (array[mid] <= array[end]) end = mid;
        }
        return array[mid];
    }
    public int MinInOrder(int[] numbers, int start, int end){
        int res = numbers[start];
        for(int i=start+1; i<end; i++){
            if (res > numbers[i]){
                res = numbers[i];
            }
        }
        return res;
    }
}
