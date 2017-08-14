  public List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
		  ArrayList<Integer> res = new ArrayList<>();
		  int low = 0, high = arr.size()-1,mid=-1, pos = 0;
		  if(x >= arr.get(high))
			  pos = high;
		  else{
			  while(low <= high){
				  mid = (low+high) >>> 1;
				  if(arr.get(mid) == x){
					  pos = mid;
					  break;
				  }
				  else if(arr.get(mid) > x)
					  high = mid - 1;
				  else
					  low = mid + 1;
			  }
		  }
		  if(mid != pos)
			  pos = high;
		  int [] d = new int [arr.size()];
		  
		  for(int i = 0; i < arr.size(); i++){
			  d[i] = Math.abs(arr.get(i)-x);
		  }
		  int i = pos, j = i+1, count = 0; 
		  while(i >= 0 && j < d.length && count < k){
			  if(d[i] > d[j]){
				  res.add(arr.get(j));
				  j ++;
				  count ++;
			  }else{
				  res.add(arr.get(i));
				  i --;
				  count ++;
			  }
		  }
		  while(i >= 0 && count < k){
			  res.add(arr.get(i));
			  i --;
			  count ++;
		  }
		  while(j < d.length && count < k){
			  res.add(arr.get(j));
			  j ++;
			  count ++;
		  }
		// System.out.println(pos);
		  Collections.sort(res);
		  return res;
	   }
