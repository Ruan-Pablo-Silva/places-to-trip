export interface Info<T>{
  message: string;
  errorMessage: string;
  data: T;
  listData: [T];
  success: boolean;

}
