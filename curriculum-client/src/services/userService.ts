import axios, { AxiosResponse } from 'axios';
import { User } from '../models/User';

const getUser = async ( id: number): Promise<AxiosResponse<User, any>> => {
    return await axios.get<User>(`http://localhost:8080/user/${id}`);
}

export  {
    getUser
}