import { Item } from "./item";

export interface Campaign {
    id: number;
    cover_image: string;
    title: string;
    description: string;
    status: string;
    active: boolean;
    item: Item[];
}